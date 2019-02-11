package com.academy.library.controller;

import org.springframework.ui.Model;

import com.academy.library.dto.Booking;

public interface BookingControllerIf {

	public String list(Model model);

	public String moveInsert(Model model);

	public String insert(Booking booking, Model model);

	public String moveUpdate(String bookingId, Model model);

	public String update(Booking booking, Model model);

	public String select(String bookingId, Model model);

	public String delete(String bookingId, Model model);

}
