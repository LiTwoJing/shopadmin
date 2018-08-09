package shopadmin.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shopadmin.pojo.Cellphone;
import shopadmin.service.CellphoneService;

@Controller
public class CellphoneController {
	
	private CellphoneService cellphoneService;
	
	@Autowired
	public CellphoneController(CellphoneService cellphoneService) {
		this.cellphoneService = cellphoneService;
	}



	@RequestMapping(method=RequestMethod.GET,value="/cellphone/")
	public String list(Model model){
		List<Cellphone> ce = cellphoneService.findAll();
		model.addAttribute("cellphone", ce);
		return "cellphone-list";
	}

	
	@RequestMapping(method=RequestMethod.GET,value="/cellphone/{id}/add")
	public String add(@ModelAttribute Cellphone cellphone,@PathVariable Integer id,Model model){
		Cellphone ce = cellphoneService.findOne(id);
		System.out.println(ce);
		model.addAttribute("cellphone", ce);
		return "cellphone-delit";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/cellphone/add")
	public String addcellphone(@ModelAttribute Cellphone cellphone){
		
		return "cellphone-delit";
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/cellphone/add")
	public String create(@ModelAttribute @Valid Cellphone cellphone,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "cellphone-delit";
		}
		cellphoneService.insert(cellphone);
		return "redirect:/cellphone/";
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/cellphone/{id}")
	public String drop(@PathVariable Integer id){
		System.out.println(""+id);
		cellphoneService.drop(id);
		return "redirect:/cellphone/";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/cellphone/{id}/add")
	public String update(@ModelAttribute @Valid Cellphone cellphone,BindingResult bindingResult,@PathVariable Integer id,Model model){
		if(bindingResult.hasErrors()){
			return "cellphone-delit";
		}
		cellphoneService.update(cellphone);
		return "redirect:/cellphone/";
	}
}
