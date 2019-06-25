package edu.sse.ustc.elasticsearch.domain;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/** ElasticSearch的文档
 * @author imarklei90
 * @since 2019.06.23
 */

@Document(indexName = "esBean", type = "es") // 注解为ElasticSearch的文档
public class EsBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String title;
	private String content;

	public EsBean() {
	}

	public EsBean(String id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "EsBean{" +
				"id='" + id + '\'' +
				", title='" + title + '\'' +
				", content='" + content + '\'' +
				'}';
	}
}
