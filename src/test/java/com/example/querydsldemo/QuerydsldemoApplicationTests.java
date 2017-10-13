package com.example.querydsldemo;

import com.example.querydsldemo.domain.Book;
import com.example.querydsldemo.domain.QBook;
import com.example.querydsldemo.domain.QBookStore;
import com.querydsl.jpa.HQLTemplates;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuerydsldemoApplicationTests {


	@Autowired
	private EntityManager em;
	@Test
	public void contextLoads() {
		JPAQueryFactory jap = new JPAQueryFactory(new HQLTemplates(),em);
		QBook book = QBook.book;
		QBookStore store = QBookStore.bookStore;
		List<Book> list = jap.select(book).from(book).leftJoin(store).on(book.id.eq(store.bookId)).fetch();

	}

}
