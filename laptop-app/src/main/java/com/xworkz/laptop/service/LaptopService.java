package com.xworkz.laptop.service;

import java.util.List;

import com.xworkz.laptop.dto.LaptopDTO;

public interface LaptopService {
	boolean validateLaptopDTO(LaptopDTO dto);

	boolean saveLaptopDTO(LaptopDTO laptopDTO);

	default LaptopDTO findByNameLaptopDTO(String name) {
		return null;
	}

	default LaptopDTO UpdateByNameLaptopDTO(String name, String brand, String color, float price, int ram, int rom,
			String hardDisk) {
		return null;
	}

	boolean DeleteLaptopDTO(String name);

	List<Object> getAllLaptopDTO();

}