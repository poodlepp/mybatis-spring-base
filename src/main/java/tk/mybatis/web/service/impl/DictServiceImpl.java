package tk.mybatis.web.service.impl;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.web.dao.DictDao;
import tk.mybatis.web.bean.SysDict;
import tk.mybatis.web.service.DictService;

import java.util.List;

/**
 * @author liuzh
 */
@Service
public class DictServiceImpl implements DictService {

    @Autowired
    private DictDao dictDao;

    @Override
    public SysDict findById(Long id) {
        return dictDao.selectByPrimaryKey(id);
    }

    public List<SysDict> findBySysDict(SysDict sysDict, Integer offset, Integer limit) {
        RowBounds rowBounds = RowBounds.DEFAULT;
        if(offset != null && limit != null){
            rowBounds = new RowBounds(offset, limit);
        }
        return dictDao.selectBySysDict(sysDict, rowBounds);
    }

    @Override
    public boolean saveOrUpdate(SysDict sysDict) {
        if(sysDict.getId() == null){
            return dictDao.insert(sysDict) == 1;
        } else {
            return dictDao.updateById(sysDict) == 1;
        }
    }

    @Override
    public boolean deleteById(Long id) {
    	if(id == null){
    		throw new NullPointerException("id");
    	}
        return dictDao.deleteById(id) == 1;
    }
}
