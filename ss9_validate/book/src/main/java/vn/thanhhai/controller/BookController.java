package vn.thanhhai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.thanhhai.model.Book;
import vn.thanhhai.model.Oder;
import vn.thanhhai.service.BookService;
import vn.thanhhai.service.OderService;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private OderService oderService;

    @GetMapping("")
    public String list(Model model) {
        List<Book> bookList = bookService.findAll();
        model.addAttribute("bookList", bookList);
        return "list";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("bookList", bookService.findById(id));
        return "/view";

    }

    @GetMapping("/{id}/oder")
    public String oder(@PathVariable int id, Model model) throws Exception {
        Oder oder = new Oder();
        //thay doi random ma code
        int code = (int) (Math.random() * (99999 - 10000) + 10000);
        oder.setCode(code);
        //thay doi ngay hien tai tren he thong
        String dateNow = String.valueOf(new Date(System.currentTimeMillis()));
        oder.setDate(dateNow);
        //thay doi so luong khi co ai do oder
        Book book = bookService.findById(id);
        book.setCount(book.getCount() - 1);
        if (book.getCount() == -1) {
            throw new Exception();
        }
        oder.setBookOder(book);

        Set<Oder> oders = book.getOders();
        //them doi tuong oder vao danh sach oder trong doi tuong book
        oders.add(oder);
        book.setOders(oders);

        bookService.save(book);
        oderService.save(oder);
        List<Book> bookList = bookService.findAll();
        model.addAttribute("bookList", bookList);
        return "redirect:/book/";
    }

    @ExceptionHandler(Exception.class)
    public String handleError() {
        return "error";
    }


}
