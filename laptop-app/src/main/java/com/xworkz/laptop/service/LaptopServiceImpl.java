package com.xworkz.laptop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.laptop.dto.LaptopDTO;
import com.xworkz.laptop.entity.LaptopEntity;
import com.xworkz.laptop.exception.InvalidBrand;
import com.xworkz.laptop.exception.InvalidColor;
import com.xworkz.laptop.exception.InvalidHardDisk;
import com.xworkz.laptop.exception.InvalidName;
import com.xworkz.laptop.exception.InvalidPrice;
import com.xworkz.laptop.exception.InvalidRAM;
import com.xworkz.laptop.exception.InvalidROM;
import com.xworkz.laptop.repository.LaptopRepository;

@Service
public class LaptopServiceImpl implements LaptopService {

	@Autowired
	private LaptopRepository repository;

	public LaptopServiceImpl(LaptopRepository repository) {
		this.repository = repository;
		System.out.println(this.getClass().getSimpleName() + "bean created");
		System.out.println("invoked service method");
	}

	@Override
	public boolean validateLaptopDTO(LaptopDTO dto) throws InvalidName {
		System.out.println("invoked validateLaptopDTO()");
		boolean temp = false;

		if (dto.getName() != null && !(dto.getName().isEmpty()) && dto.getName().length() > 1
				&& dto.getName().length() < 10) {
			System.out.println("valid Laptop Name");
			temp = true;

		} else {
			InvalidName invalidName = new InvalidName("Invalid Laptop Name");
			throw invalidName;
		}
		if (dto.getBrand() != null && !(dto.getBrand().isEmpty()) && dto.getBrand().length() > 3
				&& dto.getBrand().length() < 15) {
			System.out.println("valid Laptop Brand");
			temp = true;

		} else {
			InvalidBrand invalidBrand = new InvalidBrand("Invalid Laptop Brand");
			throw invalidBrand;
		}
		if (dto.getColor() != null && !(dto.getColor().isEmpty()) && dto.getColor().length() > 3
				&& dto.getColor().length() < 10) {
			System.out.println("valid Laptop Color");
			temp = true;

		} else {
			InvalidColor invalidColor = new InvalidColor("Invalid Laptop Color");
			throw invalidColor;
		}
		if (dto.getHardDisk() != null && !(dto.getHardDisk().isEmpty()) && dto.getHardDisk().length() > 3
				&& dto.getHardDisk().length() < 15) {
			System.out.println("valid Laptop HardDisk");
			temp = true;

		} else {
			InvalidHardDisk invalidHardDisk = new InvalidHardDisk("Invalid Laptop HardDisk");
			throw invalidHardDisk;
		}
		if (dto.getPrice() != 0) {
			System.out.println("valid Laptop Price");
			temp = true;

		} else {
			InvalidPrice invalidPrice = new InvalidPrice("Invalid Laptop Price");
			throw invalidPrice;
		}
		if (dto.getRam() != 0) {
			System.out.println("valid Laptop RAM");
			temp = true;

		} else {
			InvalidRAM invalidRAM = new InvalidRAM("Invalid Laptop RAM");
			throw invalidRAM;
		}
		if (dto.getRom() != 0) {
			System.out.println("valid Laptop ROM");
			temp = true;

		} else {
			InvalidROM invalidROM = new InvalidROM("Invalid Laptop ROM");
			throw invalidROM;
		}

		return temp;
	}

	@Override
	public boolean saveLaptopDTO(LaptopDTO laptopDTO) {
		System.out.println("invoked saveLaptopDTO");
		LaptopEntity entity = new LaptopEntity();
		BeanUtils.copyProperties(laptopDTO, entity);

		boolean isEntitySaved = repository.saveLaptopEntity(laptopDTO);
		return isEntitySaved;
	}
	
	
	@Override
	public LaptopDTO findByNameLaptopDTO(String name) {
		System.out.println("invoked findByNameLaptopDTO");
		LaptopEntity entity = this.repository.findByName(name);

		LaptopDTO dto=new LaptopDTO();
		BeanUtils.copyProperties(entity, dto);

		return LaptopService.super.findByNameLaptopDTO(name);
	}

	@Override
	public boolean DeleteLaptopDTO(String name) {
		System.out.println("invoked DeleteLaptopDTO() ");
		boolean result = this.repository.deleteByName(name);
		return result;
	}

	@Override
	public List<Object> getAllLaptopDTO() {
		System.out.println("invoked getAllLaptopDTO() ");
		List<Object> laptopContainer = null;
		List<LaptopEntity> laptopEntityContainer = this.repository.getAll();
		if (laptopEntityContainer != null) {
			return laptopContainer = new ArrayList<Object>(laptopEntityContainer);
		}
		return laptopContainer;
	}
	
	@Override
	public LaptopDTO UpdateByNameLaptopDTO(String name, String brand, String color, float price, int ram, int rom,
			String hardDisk) {
		System.out.println("invoked UpdateByNameLaptopDTO() ");
		LaptopEntity entity = new LaptopEntity();
		this.repository.upadteByName(entity);	
		return LaptopService.super.UpdateByNameLaptopDTO(name, brand, color, price, ram, rom, hardDisk);
	}

}