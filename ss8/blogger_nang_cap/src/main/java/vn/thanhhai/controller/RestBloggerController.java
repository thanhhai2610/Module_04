package vn.thanhhai.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.thanhhai.dto.BlogerDto;
import vn.thanhhai.model.Bloger;
import vn.thanhhai.model.Category;
import vn.thanhhai.service.IBloggerService;
import vn.thanhhai.service.ICategoryService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/blogger/v1")
public class RestBloggerController {
    @Autowired
    private IBloggerService bloggerService;
    @Autowired
    private ICategoryService categoryService;

    /*Lay tai nguyen*/
    @GetMapping("")
    public ResponseEntity<List<BlogerDto>> getBloggerList() {
        List<Bloger> bloggerList = bloggerService.findAll();

        if (bloggerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        List<BlogerDto> blogerDtoList = new ArrayList<>();
        for (Bloger x : bloggerList) {
            BlogerDto blogerDto = new BlogerDto();
            BeanUtils.copyProperties(x, blogerDto);
            blogerDto.setCategoryId(x.getCategory1().getIdCategory());
            blogerDtoList.add(blogerDto);
        }
        return new ResponseEntity<>(blogerDtoList, HttpStatus.OK);
    }


    @PostMapping
    private ResponseEntity addBlogger(@RequestBody BlogerDto blogerDto) {
        Bloger bloger = new Bloger();
        BeanUtils.copyProperties(blogerDto, bloger);
        bloggerService.save(bloger);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bloger> updateBloger(@PathVariable int id,
                                               @RequestBody BlogerDto bloggerDto) {
        Bloger currentBloger = bloggerService.findById(id);
        if (currentBloger == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        BeanUtils.copyProperties(bloggerDto, currentBloger);
        bloggerService.save(currentBloger);
        return new ResponseEntity<>(currentBloger, HttpStatus.OK);
    }

    @GetMapping("category")
    public ResponseEntity<List<Category>> getCategoryList() {
        List<Category> categoryList = categoryService.findAll();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping("blogger/{id}")
    public ResponseEntity<List<Bloger>> getCategoryListId(@PathVariable int id) {
        List<Bloger> blogerList = bloggerService.getListByCategoryId(id);
        ;
        if (blogerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogerList, HttpStatus.OK);
    }

}
