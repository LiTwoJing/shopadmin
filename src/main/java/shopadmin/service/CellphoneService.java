package shopadmin.service;

import java.util.List;

import javax.validation.Valid;

import shopadmin.pojo.Cellphone;

public interface CellphoneService {

	List<Cellphone> findAll();

	void insert(Cellphone cellphone);

	void drop(Integer id);

	Cellphone findOne(Integer id);

	void update(Cellphone cellphone);
}
