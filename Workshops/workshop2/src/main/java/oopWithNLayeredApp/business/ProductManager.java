package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception{

        if(product.getUnitPrice() < 10){
            throw new Exception(" Ürün fiyatı 10 dan küçük olamaz ");
        }

        //JdbcProductDao productDao = new JdbcProductDao();
        //productDao.add(product);

        //HibernateProductDao productDao = new HibernateProductDao();

        //ProductDao productDao = new HibernateProductDao();
        productDao.add(product);

        for (Logger logger : loggers) {
            logger.log(product.getName());
        }


    }
}
