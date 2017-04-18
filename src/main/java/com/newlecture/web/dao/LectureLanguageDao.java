package com.newlecture.web.dao;

import java.util.List;

import com.newlecture.web.entity.LectureLanguage;


public interface LectureLanguageDao {
	
	List<LectureLanguage> getList(String lectureCode);
	LectureLanguage get(String code);
	
	int add(LectureLanguage lectureLanguage);
	int update(LectureLanguage lectureLanguage);
	int delete(String code);
}
