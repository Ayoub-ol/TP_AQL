package TP03.partie1.ex02;

import TP03.partie1.ex02.Order;
import TP03.partie1.ex02.OrderController;
import TP03.partie1.ex02.OrderDao;
import TP03.partie1.ex02.OrderService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class OrderControllerTest {

    @Test
    public void testCreateOrder() {
        /////////////////////////////////////////////////////
        OrderService mockOrderService = mock(OrderService.class);
        OrderController orderController = new OrderController(mockOrderService);
        Order order = new Order();
        orderController.createOrder(order);
        verify(mockOrderService).createOrder(order);
        //////////////////////////////////////////////////
        OrderDao mockOrderDao = mock(OrderDao.class);
        OrderService orderService = new OrderService(mockOrderDao);
        orderService.createOrder(order);
        verify(mockOrderDao).saveOrder(order);
    }
}