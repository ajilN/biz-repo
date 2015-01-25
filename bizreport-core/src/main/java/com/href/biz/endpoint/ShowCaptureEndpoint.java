package com.href.biz.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.href.biz.dto.FilmDTO;
import com.href.biz.dto.ShowDTO;

@Controller("showCaptureEndpoint")
public class ShowCaptureEndpoint {

	
	@RequestMapping(value = "/shows", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ShowDTO>> listShows(){
		List<ShowDTO>  shows = new ArrayList<ShowDTO>();
		ShowDTO show = new ShowDTO();
		FilmDTO filmDTO = new FilmDTO();
		filmDTO.setName("Picket 43");
		show.setFilim(filmDTO);
		show.setGrossAmount("60000");
		show.setReservationAmount("2000");
		show.setOnlineTicketAmount("4000");
		show.setTimeSlot("9 AM");
		show.setTotalTicketSoldOut("200");
		shows.add(show);
		show.setFilim(filmDTO);
		show.setGrossAmount("80000");
		show.setReservationAmount("4000");
		show.setOnlineTicketAmount("5000");
		show.setTimeSlot("12 AM");
		show.setTotalTicketSoldOut("280");
		shows.add(show);
        return new ResponseEntity<List<ShowDTO>>(shows, HttpStatus.OK);
	}
}
