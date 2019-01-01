package cn.muke.ssh.service;

import cn.muke.ssh.dao.ProductDao;
import cn.muke.ssh.domain.Product;
import org.springframework.transaction.annotation.Transactional;

/**
 * 商品管理的业务类
 */
@Transactional
public class ProductService {
    //业务层注入dao的类
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao){
        this.productDao =productDao;
    }

    /**
     * 业务层保存商品的方法
     * @param product
     */
    public void save(Product product) {
        System.out.println("productservice的save方法执行了");
        productDao.save(product);
    }
}
