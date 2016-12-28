package eu.karols.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String getHomePage() {
        LOGGER.debug("Getting home page");
        return "home";
    }

}

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import eu.karols.domain.Post;
//import eu.karols.services.PostService;
//
//import java.util.List;
//
//import static java.util.stream.Collectors.*;
//
//@Controller
//public class HomeController {
//
//    @Autowired
//    private PostService postService;
//
////    @Autowired
////    private NotificationService notificationService;
//
//    @RequestMapping("/")
//    public String home(Model model) {
//        List<Post> latest5Posts = postService.findLatest5();
//        model.addAttribute("latest5posts", latest5Posts);
//
//        List<Post> latest3Posts = latest5Posts.stream()
//                .limit(3).collect(toList());
//        model.addAttribute("latest3posts", latest3Posts);
//
//        return "index";
//    }
//
//    @RequestMapping("/post/view/{id}")
//    public String view(@PathVariable("id") Long id,
//                       Model model) {
//        Post post = postService.findById(id);
//
//        if (post == null) {
////            notificationService.addErrorMessage(
////                    "Cannot find post: " + id);
//            return "redirect:/";
//        }
//
//        model.addAttribute("post", post);
//        return "/post/view";
//    }
//}