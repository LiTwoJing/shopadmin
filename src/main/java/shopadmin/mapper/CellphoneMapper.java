package shopadmin.mapper;

import java.util.List;

import shopadmin.pojo.Cellphone;

public interface CellphoneMapper {

	List<Cellphone> findAll();

	void insert(Cellphone cellphone);

	void drop(Integer id);

	Cellphone findOne(Integer id);

	void update(Cellphone cellphone);

}
