package vn.thanhhai.repository;

import org.springframework.stereotype.Repository;
import vn.thanhhai.model.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class ProductRepo implements IProductRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = entityManager
                .createQuery("select s from Product as s", Product.class);
        return query.getResultList();
    }

    @Override
    public Product findById(int id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public List<Product> findByName(String nameInput) {
        TypedQuery<Product> query = entityManager
                .createQuery("select s from Product as s where s.name like :nameInput", Product.class)
                .setParameter("nameInput", "%" + nameInput + "%");
        return query.getResultList();
    }

    @Override
    public Product save(Product product) {
        entityManager.persist(product); //thêm mới
        return product;
    }

    @Override
    public void update(Product product) {
        entityManager.merge(product); //cập nhật
    }

    @Override
    public void delete(Product product) {
        entityManager.remove(entityManager.merge(product)); //xóa
    }
}
