package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.hamcrest.Matchers.containsString;

/**
 * 测试MVC
 * @author V_QS4SCV
 *
 */
@RunWith(SpringRunner.class)//pom文件中spring-boot-starter-test不能exclusion junit-vintage-engine
@WebMvcTest(HomeController.class)//<1> 可以让这个测试在springMVC中执行
public class HomeControllerTest {

  @Autowired
  private MockMvc mockMvc;   //<2> 注入MockMVC 可用于SpringMVC服务端测试点

  @Test
  public void testHomePage() throws Exception {
    mockMvc.perform(get("/"))    // <3> 发起对/的get请求
      .andExpect(status().isOk())  // <4> 希望响应
      .andExpect(view().name("home"))  // <5> 逻辑视图名称
      .andExpect(content().string(           // <6> 渲染后的视图包含
          containsString("Welcome to...")));  
  }

}
