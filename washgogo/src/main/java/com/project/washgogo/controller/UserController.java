package com.project.washgogo.controller;

import com.project.washgogo.domain.dao.UserDAO;
import com.project.washgogo.domain.vo.OrderVO;
import com.project.washgogo.domain.vo.UserVO;
import com.project.washgogo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/*")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;

    @GetMapping("myPage")
    public String myPage(UserVO userVO){
        log.info(userVO.toString());
        return "/user/myPage";
    }

    @GetMapping("notice")
    public void notice(){

    }

    @GetMapping("point")
    public String point(UserVO userVO) {
        log.info(userVO.toString());
        return "/user/point";
    }


    @GetMapping("modifyingInformation")
    public String modifyingInformation(UserVO userVO){
        return "/user/modifyingInformation";
    }

    @PostMapping("modifyingInformation")
    public String modifyingInformationOK(UserVO userVO){
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

    // 자유이용서비스
    @PostMapping("/serviceAddressOk")
    public String serviceAddressOk(UserVO userVO){
        log.info("-------------------------------------");
        log.info("userVO : " + userVO.toString());
        log.info("-------------------------------------");

        userService.modifyAddress(userVO);
        return "/service/serviceSubscribePayment";
    }

    @PostMapping("/servicePaymentOk")
    public String servicePaymentOk(UserVO userVO){
        log.info("-------------------------------------");
        log.info("userVO : " + userVO.toString());
        log.info("-------------------------------------");

        userService.changeService(userVO);
        return "/index";
    }

}