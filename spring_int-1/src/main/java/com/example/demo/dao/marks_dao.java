package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Marks;
import com.example.demo.Repository.marks_repo;

@Service
public class marks_dao {

	@Autowired
	marks_repo repo;

	public Marks addmarks(Marks m) {

		double Totalmarks = m.getTelugu() + m.getEnglish() + m.getHindi() + m.getScience() + m.getSocial();

		m.setTotalmarks(Totalmarks);

		double percentage = ((Totalmarks * 100) / 500);

		m.setPercentage(percentage);

		return repo.save(m);
	}

	public List<Marks> add_marks(List<Marks> m) {

		return repo.saveAll(m);
	}

	public String deletemarks(int rollno) {

		repo.deleteById(rollno);
		return "deleted successfully" + rollno;
	}

	public Optional<Marks> Getbyid(int rollno) {

		return repo.findById(rollno);
	}

	public List<Marks> Getall() {

		return repo.findAll();
	}

	public Marks update_marks(Marks m) {

		int rollno = m.getRollno();

		Marks M = repo.findById(rollno).get();

		M.setTelugu(m.getTelugu());

		M.setEnglish(m.getEnglish());

		M.setHindi(m.getHindi());

		M.setScience(m.getScience());

		M.setSocial(m.getSocial());

		M.setTotalmarks(m.getTelugu() + m.getEnglish() + m.getHindi() + m.getScience() + m.getSocial());

		double percentage = ((M.getTotalmarks() * 100) / 500);

		M.setPercentage(percentage);

		return repo.save(M);

	}
}
