package com.amisoft.restaurantkitchen.service;


import com.amisoft.restaurantkitchen.vo.OrderDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KitchenService {

    public void createKitchenOrder(OrderDetails orderDetails){

        log.info("Oder details is : {}", orderDetails.getCustomerId());
    }
}
