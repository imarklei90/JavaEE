package edu.sse.ustc.elasticsearch.controller;

import edu.sse.ustc.elasticsearch.domain.EsBean;
import edu.sse.ustc.elasticsearch.repository.EsRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/** ElasticSearch 控制器
 * @author imarklei90
 * @since 2019.06.23
 */
@RestController
public class EsBeanController {

	@Autowired
	private EsRepostiory esRepostiory;

	@RequestMapping("/lists")
	public List<EsBean> list(@RequestParam(value = "title") String title, @RequestParam(value = "content") String content,
							 @RequestParam(value = "pageIndex", defaultValue = "0") int pageIndex,
							 @RequestParam(value = "pageSize", defaultValue = "10") int pageSize
	){
		Pageable pageable = new PageRequest(pageIndex, pageSize);
		Page<EsBean> page = esRepostiory.findDistinctEsBeanByTitleContainingOrContentContaining(title, content, pageable);
		return page.getContent();
	}
}
