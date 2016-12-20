package eu.karols.controller;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import eu.karols.domain.Post;
import eu.karols.domain.Task;
import eu.karols.domain.User;
import eu.karols.repositories.TaskRepository;
import eu.karols.services.PostService;
import eu.karols.services.TaskService;


@Controller
public class IndexController {

	@Autowired
	private TaskService taskService;

	@RequestMapping("/tasks")
	public String tasks(Model model) {
	List<Task> allTasks = taskService.findAll();
	model.addAttribute("allTasks", allTasks);

	return "allTasks";
	}
	
	@Autowired
	private PostService postService;

	@RequestMapping("/posts")
	public String posts(Model model) {
	List<Post> latest5Posts = postService.findLatest5();
	model.addAttribute("latest5posts", latest5Posts);

	List<Post> latest3Posts = latest5Posts.stream()
	.limit(3).collect(Collectors.toList());
	model.addAttribute("latest3posts", latest3Posts);

	return "posts";
	}
	
/*	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Calendar.class, new FlexibleCalendarEditor());
	}*/
/*	@Autowired
	TaskRepository taskRepository;
    @RequestMapping("/add")
    @ResponseBody
    public String testMethod() {
        StringBuilder response = new StringBuilder();
 
        Task task = new Task()
                .withName("Task 1")
                .withDescription("Test task")
                .withBudget(123.55)
                .withDone(true);
        taskRepository.save(task);
 
        for(Task i: taskRepository.findAll()) {
            response.append(i).append("<br>");
        }
        return response.toString();
    }
	@GetMapping("/formtask")
	public String formTask(Model model) {
		model.addAttribute("task", new Task());

		return "formtask";
	}*/

//	@PostMapping("/formtask/add")
//    public String formSubmit(@RequestParam("name") String name,
//            @RequestParam("description") String description,
//            @RequestParam("budget") Double budget,
//    		@RequestParam("done") Boolean done){
//task.save(new Task(name, description, budget, done));
//return "redirect:/index";
    
//    @PostMapping("/formtask")
//    public String formSubmit(@ModelAttribute Task		 Task) {
//        return "resultformtask";
//    }
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/userform")
	public String userform() {
		return "userform";
	}
	@RequestMapping("/userpage")
	public String userpage() {
		return "userpage";
	}
	@RequestMapping("/admin")
	public String adminIndex() {
		return "admin/index";
	}
	@RequestMapping("/user")
	public String userIndex() {
		return "user/index";
	}
	
	
	
/*	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String showForm(User userForm) {
		return "userform";
	}

	@RequestMapping(value = "/userpage", method = RequestMethod.POST)
	public String checkPersonInfo(@Valid User user, Model model, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "index";
		}
		model.addAttribute("currentUser", user);
		return "userpage";
	}*/
}
	
/*	class FlexibleCalendarEditor extends PropertyEditorSupport {

		private static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
		private static Pattern DATE_PATTERN_YMD = Pattern
				.compile("^(?<year>\\d{4})\\D(?<month>\\d{1,2})\\D(?<day>\\d{1,2})$");
		private static Pattern DATE_PATTERN_DMY = Pattern
				.compile("^(?<day>\\d{1,2})\\D(?<month>\\d{1,2})\\D(?<year>\\d{4})$");*/
	
	/**
	 * Parse the calendar date from the given text.
	 */
/*	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (text == null || text.length() == 0) {
			setValue(null);
		} else {
			Matcher matcherYMD = DATE_PATTERN_YMD.matcher(text);
			Matcher matcherDMY = DATE_PATTERN_DMY.matcher(text);
			Matcher m;
			if (matcherYMD.matches()) {
				m = matcherYMD;
			} else if (matcherDMY.matches()) {
				m = matcherDMY;
			} else {
				throw new IllegalArgumentException(
						"Could not parse date: " + text + ". Please use " + DATE_FORMAT.toPattern());
			}
			int year = Integer.valueOf(m.group("year")).intValue();
			int month = Integer.valueOf(m.group("month")).intValue();
			int day = Integer.valueOf(m.group("day")).intValue();

			if (year > 1900 && month < 13 && day < 32) {
				Calendar cal = Calendar.getInstance();
				cal.set(year, month, day);
				setValue(cal);
			} else {
				throw new IllegalArgumentException(
						"Could not parse date: " + text + ". Please use " + DATE_FORMAT.toPattern());
			}
		}
	}*/

/*	@Override
	public String getAsText() {
		Calendar value = (Calendar) getValue();
		return (value != null ? DATE_FORMAT.format(value) : "");
}

	}*/