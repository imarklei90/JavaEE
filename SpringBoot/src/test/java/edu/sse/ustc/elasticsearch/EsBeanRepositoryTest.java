package edu.sse.ustc.elasticsearch;

import edu.sse.ustc.elasticsearch.domain.EsBean;
import edu.sse.ustc.elasticsearch.repository.EsRepostiory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

/** ElasticSearch接口测试
 * @author imarklei90
 * @since 2019.06.23
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsBeanRepositoryTest {

	@Autowired
	private EsRepostiory esRepostiory;

	// 初始化测试数据
	@Before
	public void initTestData(){
		esRepostiory.save(new EsBean("1000", "title1", "content1"));
		esRepostiory.save(new EsBean("2001", "title2", "content2"));
		esRepostiory.save(new EsBean("3000", "title3", "content3"));
	}

	@Test
	public void testFindDistinctEsBeanByTitleContainingOrContentContaining(){
		Pageable pageable = new PageRequest(0, 20);
		String title = "0";
		String content = "content";
		Page<EsBean> page = esRepostiory.findDistinctEsBeanByTitleContainingOrContentContaining(title, content, pageable);
		System.out.println(page.getTotalElements());

		for (EsBean bean : page.getContent()) {
			System.out.println(bean.toString());
		}
	}
}
