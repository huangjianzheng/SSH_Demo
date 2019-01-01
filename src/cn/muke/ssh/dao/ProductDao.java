package cn.muke.ssh.dao;

import cn.muke.ssh.domain.Product;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * 商品管理的Dao
 */
public class ProductDao extends HibernateDaoSupport {

    /**
     * dao保存商品的方法
     * @param product
     */
    public void save(Product product) {
        System.out.println("dao的save执行了");
        this.getHibernateTemplate().save(product);
    }
}
