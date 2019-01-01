package cn.muke.ssh.action;

import cn.muke.ssh.domain.Product;
import cn.muke.ssh.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品管理Action
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product> {
    // 模型驱动需要使用的类
    private Product product = new Product();

    @Override
    public Product getModel() {
        return product;
    }

    // strusts和spring整合过程中按名称自动注入的业务层的类
    private ProductService productService;

    public void setProductService(ProductService productService){
        this.productService = productService;
    }

    /**
     *  保存商品的执行方法save
     */
    public String save() {
        System.out.println("Action中的save方法执行了");
        productService.save(product);
        return NONE;
    }


}
