package com.project.washgogo.domain.dao;

import com.project.washgogo.domain.vo.OrderListVO;
import com.project.washgogo.domain.vo.OrderVO;
import com.project.washgogo.mapper.OrderListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderListDAO {
    private final OrderListMapper orderListMapper;

    //    리스트 가져오기
    public List<OrderListVO> getList() {
        return orderListMapper.getList();
    }

    //    상세 이용 내역
    public List<OrderListVO> getRecentList(Long orderNumber) {
        return orderListMapper.getRecentList(orderNumber);
    }

    //    물세탁 추가
    public void insertWasher1(Long orderNumber) {
        orderListMapper.insertWasher1(orderNumber);
    }

    //    물세탁 무게 추가
    public void insertWasher2(Long orderNumber, Long orderEAQuantity) {
        orderListMapper.insertWasher2(orderNumber, orderEAQuantity);
    }

    //    개별클리닝 추가
    public void insertCleaning(Long orderNumber, Long orderEAQuantity) {
        orderListMapper.insertCleaning(orderNumber, orderEAQuantity);
    }

    //    배송비 추가
    public void insertShipping(Long orderNumber) {
        orderListMapper.insertShipping(orderNumber);
    }
}