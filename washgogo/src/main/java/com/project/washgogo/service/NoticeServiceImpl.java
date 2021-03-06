package com.project.washgogo.service;

import com.project.washgogo.domain.dao.NoticeDAO;
import com.project.washgogo.domain.vo.Criteria;
import com.project.washgogo.domain.vo.NoticeVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Qualifier("user")
@Primary
public class NoticeServiceImpl implements NoticeService  {
    private final NoticeDAO noticeDAO;

    @Override
    public List<NoticeVO> getList(Criteria criteria) {return noticeDAO.getList(criteria);}

    @Override
    public void add(NoticeVO noticeVO) {noticeDAO.add(noticeVO);}

    @Override
    public NoticeVO get(Long noticeNumber) {
        return noticeDAO.findByNoticeNumber(noticeNumber);
    }

    @Override
    public boolean modify(NoticeVO noticeVO) {
        return noticeDAO.modify(noticeVO);
    }

    @Override
    public boolean remove(Long noticeNumber) {
        return noticeDAO.remove(noticeNumber);
    }

    @Override
    public int getTotal(Criteria criteria) {
        return noticeDAO.getTotal(criteria);
    }
}
