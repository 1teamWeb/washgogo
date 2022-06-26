package com.project.washgogo.controller;

import com.project.washgogo.domain.dao.UserDAO;
import com.project.washgogo.domain.vo.OrderVO;
import com.project.washgogo.domain.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/*")
@Slf4j
public class UserController {
    @GetMapping("myPage")
    public String myPage(UserVO userVO){
        log.info("-------------------------");
        log.info(userVO.toString());
        log.info("-------------------------");
        return "/user/myPage";
    }

    @GetMapping("notice")
    public void notice(){

    }

    @GetMapping("point")
    public String point(UserVO userVO) {
        log.info(userVO.toString());
        log.info(userVO.getUserPoint());
        return "/user/point";
    }


    @GetMapping("modifyingInformation")
    public String modifyingInformation(UserVO userVO){
        log.info(userVO.toString());
        return "/user/modifyingInformation";
    }

    @PostMapping("modifyingInformation")
    public String modifyingInformationOK(UserVO userVO){
        log.info(userVO.toString());
        return "/user/myPage";
    }

    @GetMapping("useService")
    public String useService(UserVO userVO){
        return "/user/useService";
    }

    @GetMapping("serviceChange")
    public String serviceChange(UserVO userVO){
        return "/user/serviceChange";
    }

    @GetMapping("changeCancel")
    public String changeCancel(UserVO userVO){
        return "/user/changeCancel";
    }

    @GetMapping("paymentDetails")
    public String paymentDetails(OrderVO order) {
        return "/user/paymentDetails";
    }

//    로그인 / 회원가입
    @GetMapping("/join")
    public String join(){
        log.info("--------join/Get---------");
        return "/user/join";
}

    @PostMapping("/join")
    public String joinOK(UserVO userVO){
        log.info("--------join/Post---------");
        log.info(userVO.toString());
        log.info("---------------------");
        return "/user/join";
    }

    @GetMapping("/login")
    public String login(UserVO userVO){
        log.info("---------------------");
        log.info(userVO.toString());
        log.info("---------------------");
        return "/user/login";
    }

    @PostMapping("/login")
    public String loginOK(UserVO userVO){
        log.info("---------------------");
        log.info(userVO.toString());
        log.info("---------------------");
        return "/index";
    }

    @GetMapping("/findIdPw")
    public String findIdPw(){
        return "/user/findIdPw";
    }

    @PostMapping("/findIdPw")
    public String findIdPwOK(){
        return "/user/findIdPw";
    }

    @GetMapping("/resetPw")
    public String resetPw(){
        return "/user/resetPw";
    }

    @PostMapping("/resetPw")
    public String resetPwOK(){
        return "/user/resetPw";
    }
}

    // 자유이용서비스