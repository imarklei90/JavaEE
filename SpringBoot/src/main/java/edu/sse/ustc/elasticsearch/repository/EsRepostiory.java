package edu.sse.ustc.elasticsearch.repository;

import edu.sse.ustc.elasticsearch.domain.EsBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/** ElasticSearch Repository接口
 * @author imarklei90
 * @since 2019.06.23
 */
public interface EsRepostiory extends ElasticsearchRepository<EsBean, String> {

	Page<EsBean> findDistinctEsBeanByTitleContainingOrContentContaining(String title, String content, Pageable pageable);
}
