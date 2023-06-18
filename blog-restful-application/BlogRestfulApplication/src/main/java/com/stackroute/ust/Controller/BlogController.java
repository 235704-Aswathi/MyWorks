package com.stackroute.ust.Controller;


import com.stackroute.ust.Domain.Blog;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
    private List<Blog> blog= new ArrayList<>();

    @GetMapping("")
    public List<Blog> getAll(){
        return blog;
    }

//    @GetMapping("/{id}")
//    public Blog getOne(@PathVariable int id){
//        return blog.stream().filter(blogs -> blogs.id()==id).findFirst().orElseThrow();
//    }
    @PostMapping("")
    public Blog create(@RequestBody Blog blogs){
        blog.add(blogs);
        return blogs;
    }
    @PutMapping("/{id}")
    public Blog update(@PathVariable int id, @RequestBody Blog Blogs){
        Blog exist=blog.stream().filter(t->t.id()==id).findFirst().orElseThrow();
        blog.remove(exist);
        blog.add(Blogs);
        return Blogs;
    }
    @DeleteMapping("{id}")
    public List<Blog> delete(@PathVariable int id){
        blog.removeIf(blogs -> blogs.id()==id);
        return blog;
    }

}
