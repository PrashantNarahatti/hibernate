package com.xworkz.laptop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.laptop.dto.LaptopDTO;
import com.xworkz.laptop.service.LaptopService;

@Component
@RequestMapping("/")
public class LaptopController {

	@Autowired
	private LaptopService laptopService;

	public LaptopController() {
		System.out.println("create laptop controller :" + this.getClass().getSimpleName());
	}

	@RequestMapping("/additem.do")
	public String onSubmitButtonClicked(@ModelAttribute LaptopDTO dto, Model model) {
		System.out.println("invoked onSubmitButtonClicked");
		System.out.println(dto.toString());
		boolean result = laptopService.validateLaptopDTO(dto);
		if (result) {
			boolean isDataSaved = laptopService.saveLaptopDTO(dto);

			if (isDataSaved) {
				model.addAttribute("message", "laptop data is saved to database");

			} else {
				model.addAttribute("message", "laptop data is  not saved to database");
			}
		} else {
			model.addAttribute("message", "Invalid input data! Please try again");

		}
		System.out.println(dto);

		return "/Additem.jsp";
	}

	@RequestMapping("/search.do")
	public String onSearch(@RequestParam String name, Model model) {
		System.out.println("invoked onSearchButton");
		LaptopDTO dto = this.laptopService.findByNameLaptopDTO(name);

		if (dto != null) {
			model.addAttribute("laptop", dto);
			System.out.println(dto.toString());
			model.addAttribute("message", "laptop name is found");

		} else {
			model.addAttribute("message", "laptop name is not found");
		}
		return "/Additem.jsp";
	}

	@RequestMapping("/viewAll.do")
	public String getAllLaptopItems(Model model) {
		System.out.println("Invoked getAllLaptopItems()");
		List<Object> allLaptopyItems = this.laptopService.getAllLaptopDTO();

		model.addAttribute("ListOfLaptopItems", allLaptopyItems);

		return "/Additem.jsp";
	}

	@RequestMapping("/delete.do")
	public String deleteLaptopItems(@RequestParam String name, Model model) {
		System.out.println("Invoked deleteLaptopItems()");
		LaptopDTO dto = this.laptopService.findByNameLaptopDTO(name);

		if (dto != null) {

			boolean isDeleted = this.laptopService.DeleteLaptopDTO(name);
			if (isDeleted) {
				model.addAttribute("message", "Laptop item not deleted");
			} else {
				model.addAttribute("message", "Laptop item has  been deleted");
			}
		}
		return "/Additem.jsp";
	}
	
	@RequestMapping("/update.do")
	public String onUpdate(@RequestParam String name, @RequestParam String brand, @RequestParam String color,
			@RequestParam float price, @RequestParam int ram, int rom,String hardDisk, Model model) {
		System.out.println("Invoked onUpdateButton");

		LaptopDTO result = this.laptopService.UpdateByNameLaptopDTO(name, brand, color, price, ram, rom, hardDisk);
		if (result==null) {
			model.addAttribute("message", "Laptop details have been updated");
			model.addAttribute(name, result);
		} else {
			model.addAttribute("message", " failed to updated Laptop details");

		}
		return "/Additem.jsp";

	}


}