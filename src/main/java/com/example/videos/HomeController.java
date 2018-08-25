package com.example.videos;

import com.example.videos.Model.Post;
import com.example.videos.Model.YoutubeHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.transform.Result;


@Controller
public class HomeController {


    @GetMapping("/video")
    public String video(){
        return "video";
    }


    @GetMapping("/result")
    public String result(@RequestParam String name,
                         @RequestParam String url,ModelMap modelMap){
        Post post = new Post(name,url);
        // https://www.youtube.com/watch?v=GW2T_aX1LwE
        // https://www.youtube.com/embed/GW2T_aX1LwE
        if (!url.contains("embed")){
            YoutubeHelper youtubeHelper = new YoutubeHelper();
            post.setUrl("https://www.youtube.com/embed/"+youtubeHelper.extractVideoIdFromUrl(url));
        }



        modelMap.put("post",post);
        return "result";
    }


}
