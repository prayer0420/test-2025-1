package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ArticleDaoImpl;
import dao.ArticleDao;
import dto.Article;

@WebServlet("/insertTest")
public class InsertTestServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Article article = new Article();
        article.setTitle("테스트 제목");
        article.setContent("이건 내용입니다.");
        article.setWriter("kosta");

        ArticleDao dao = new ArticleDaoImpl(); 
        dao.insertArticle(article);

        response.getWriter().println("✅ DB Insert 완료 (DAO 사용)!");
    }
}
