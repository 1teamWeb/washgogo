package com.project.washgogo.service;

import com.project.washgogo.domain.dao.OrderDAO;
import com.project.washgogo.domain.vo.OrderListVO;
import com.project.washgogo.domain.vo.OrderVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private OrderDAO orderDAO;

    public List<OrderVO> getList() {
        return orderDAO.getList();
    }
    public void requestApply(OrderVO orderVO, OrderListVO orderListVO) {
        orderDAO.requestApply(orderVO, orderListVO);
    }
    public OrderVO getLog(Long orderNumber) {
        return orderDAO.getLog(orderNumber);
    }
    public int getTotalQuantity() {
        return orderDAO.getTotalQuantity();
    }
    public int getTotalPrice() {
        return orderDAO.getTotalPrice();
    }
    public boolean removeRequest(Long orderNumber) {
        return orderDAO.removeRequest(orderNumber);
    }
}