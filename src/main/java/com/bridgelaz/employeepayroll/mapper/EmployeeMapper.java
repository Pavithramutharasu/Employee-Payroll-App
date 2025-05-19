package com.bridgelaz.employeepayroll.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.bridgelaz.employeepayroll.dto.EmployeeDTO;
import com.bridgelaz.employeepayroll.model.EmployeeModel;

public class EmployeeMapper {
	public EmployeeDTO entitytodto(EmployeeModel e) {
		EmployeeDTO edto = new EmployeeDTO(
				e.getId(),e.getName(),e.getSalary());
		return edto;
	}
	public EmployeeModel dtoToEntity(EmployeeDTO entity) {
		EmployeeModel em = new EmployeeModel(entity.getId(),entity.getName(),entity.getSalary());
		return em;
	}
	public List<EmployeeModel> dtoToEntityList(List<EmployeeDTO> e){
		return e.stream().map(d->dtoToEntity(d)).collect(Collectors.toList());
	}
	public List<EmployeeDTO> entityToDTOList(List<EmployeeModel> e){
		return e.stream().map(d->entitytodto(d)).collect(Collectors.toList());
	}

}
