package shopadmin.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shopadmin.mapper.CellphoneMapper;
import shopadmin.pojo.Cellphone;
import shopadmin.service.CellphoneService;

@Service
public class CellphoneServiceImpl implements CellphoneService {
	private CellphoneMapper cellphoneMapper;
	
	@Autowired
	public CellphoneServiceImpl(CellphoneMapper cellphoneMapper) {
		this.cellphoneMapper = cellphoneMapper;
	}

	public List<Cellphone> findAll() {
		return cellphoneMapper.findAll();
	}

	@Override
	public void insert(Cellphone cellphone) {
		cellphoneMapper.insert(cellphone);
	}

	@Override
	public void drop(Integer id) {
		cellphoneMapper.drop(id);
	}

	@Override
	public Cellphone findOne(Integer id) {
		return cellphoneMapper.findOne(id);
	}

	public void update(Cellphone cellphone) {
		cellphoneMapper.update(cellphone);
	}
}
