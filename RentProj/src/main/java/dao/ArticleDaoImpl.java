package dao;

import dto.Article;
import utils.mybatisSqlSessionFactory;

import org.apache.ibatis.session.SqlSession;

public class ArticleDaoImpl implements ArticleDao {

	SqlSession session = mybatisSqlSessionFactory.getSqlSessionFactory().openSession();
	
    @Override
    public void insertArticle(Article article) {
            session.insert("mapper.article.insertArticle",article);
            session.commit();
    }
}
