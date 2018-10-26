package lovedo.top.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.apache.log4j.Logger;

@Controller
public class indexcontroller {

	@RequestMapping("/pages")
    public ModelAndView view(HttpServletRequest request){
        String path = request.getParameter("view") + "";
        ModelAndView mav = new ModelAndView();
        /* 是图片获得路径，因为用绝对路径会把路径写死，而且本地上传到服务器文件路径可能会改变导致读取不到相关内容 */
//        String contextpath=request.getContextPath();
//        mav.addObject("contextpath",contextpath);
        mav.setViewName(path);
        return mav;
    }
	
	private static Logger index = Logger.getLogger(indexcontroller.class);
	 
    @RequestMapping(value = "/pages/index", produces = "text/html; charset=utf-8")
    public ModelAndView getindexpage() {
        ModelAndView view = new ModelAndView("index");
        return view;
    }
/*    private static Logger about = Logger.getLogger(indexcontroller.class);
	 
    @RequestMapping(value = "/pages/about", produces = "text/html; charset=utf-8")
    public ModelAndView getaboutpage() {
        ModelAndView view = new ModelAndView("/pages/about");
        return view;
    }
    private static Logger gbook = Logger.getLogger(indexcontroller.class);
	 
    @RequestMapping(value = "/pages/gbook", produces = "text/html; charset=utf-8")
    public ModelAndView getgbookpage() {
        ModelAndView view = new ModelAndView("gbook");
        return view;
    }
    private static Logger info = Logger.getLogger(indexcontroller.class);
	 
    @RequestMapping(value = "/pages/info", produces = "text/html; charset=utf-8")
    public ModelAndView getinfopage() {
        ModelAndView view = new ModelAndView("info");
        return view;
    }
    private static Logger life = Logger.getLogger(indexcontroller.class);
	 
    @RequestMapping(value = "/pages/life", produces = "text/html; charset=utf-8")
    public ModelAndView getlifepage() {
        ModelAndView view = new ModelAndView("life");
        return view;
    }
    private static Logger list = Logger.getLogger(indexcontroller.class);
	 
    @RequestMapping(value = "/pages/list", produces = "text/html; charset=utf-8")
    public ModelAndView getlistpage() {
        ModelAndView view = new ModelAndView("list");
        return view;
    }
    private static Logger share = Logger.getLogger(indexcontroller.class);
	 
    @RequestMapping(value = "/pages/share", produces = "text/html; charset=utf-8")
    public ModelAndView getsharepage() {
        ModelAndView view = new ModelAndView("share");
        return view;
    }
    private static Logger time = Logger.getLogger(indexcontroller.class);
    
    @RequestMapping(value = "/pages/time", produces = "text/html; charset=utf-8")
    public ModelAndView gettimepage() {
        ModelAndView view = new ModelAndView("time");
        return view;
    }*/
}
