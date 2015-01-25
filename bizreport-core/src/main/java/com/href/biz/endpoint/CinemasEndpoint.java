package com.href.biz.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.href.biz.dto.FacilityDTO;
import com.href.biz.dto.FilmDTO;
import com.href.biz.dto.ScreenDTO;
import com.href.biz.dto.ShowDTO;

@Controller("cinemasEndpoint")
public class CinemasEndpoint {
	
	@RequestMapping(value = "/cinemas/{screen}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<ScreenDTO> getScreenDts(final @PathVariable String screen){
		
		ScreenDTO screenDtls  = new ScreenDTO();
		screenDtls.setId("1");
		screenDtls.setName(screen);
		
		List<FacilityDTO> facilities  = new ArrayList<FacilityDTO>();
		FacilityDTO fac = new FacilityDTO();
		fac.setCategory("Diamond Class");
		fac.setRate("250");
		facilities.add(fac);
		fac = new FacilityDTO();
		fac.setCategory("Gold Class");
		fac.setRate("200");
		facilities.add(fac);
		fac = new FacilityDTO();
		fac.setCategory("Silver Class");
		fac.setRate("150");
		facilities.add(fac);
		
		
		
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
		show.setFacilities(facilities);
		shows.add(show);
		show.setFilim(filmDTO);
		show.setGrossAmount("80000");
		show.setReservationAmount("4000");
		show.setOnlineTicketAmount("5000");
		show.setTimeSlot("12 AM");
		show.setTotalTicketSoldOut("280");
		show.setFacilities(facilities);
		shows.add(show);
		
		screenDtls.setShows(shows);
		
        return new ResponseEntity<ScreenDTO>(screenDtls, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/cinemas/{screen}/{showCat}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<ShowDTO> getShowDts(final @PathVariable String screen , final @PathVariable String showCat){
		
		ScreenDTO screenDtls  = new ScreenDTO();
		screenDtls.setId("1");
		screenDtls.setName(screen);
		
		List<FacilityDTO> facilities  = new ArrayList<FacilityDTO>();
		FacilityDTO fac = new FacilityDTO();
		fac.setCategory("Diamond Class");
		fac.setRate("250");
		facilities.add(fac);
		fac = new FacilityDTO();
		fac.setCategory("Gold Class");
		fac.setRate("200");
		facilities.add(fac);
		fac = new FacilityDTO();
		fac.setCategory("Silver Class");
		fac.setRate("150");
		facilities.add(fac);
		
		
		
		List<ShowDTO>  shows = new ArrayList<ShowDTO>();
		ShowDTO show = new ShowDTO();
		FilmDTO filmDTO = new FilmDTO();
		filmDTO.setId("1");
		filmDTO.setName("Picket 43");
		show.setFilim(filmDTO);
		show.setGrossAmount("60000");
		show.setReservationAmount("2000");
		show.setOnlineTicketAmount("4000");
		show.setTimeSlot("9 AM");
		show.setTotalTicketSoldOut("200");
		show.setFacilities(facilities);
		/*shows.add(show);
		show.setFilim(filmDTO);
		show.setGrossAmount("80000");
		show.setReservationAmount("4000");
		show.setOnlineTicketAmount("5000");
		show.setTimeSlot("12 AM");
		show.setTotalTicketSoldOut("280");
		show.setFacilities(facilities);
		shows.add(show);*/
		
		screenDtls.setShows(shows);
		
        return new ResponseEntity<ShowDTO>(show, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/cinemas/{screen}/{showCat}/facilities", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<FacilityDTO>> getFacilities(final @PathVariable String screen , final @PathVariable String showCat){
		
		
		List<FacilityDTO> facilities  = new ArrayList<FacilityDTO>();
		FacilityDTO fac = new FacilityDTO();
		fac.setCategory("Diamond Class");
		fac.setRate("250");
		facilities.add(fac);
		fac = new FacilityDTO();
		fac.setCategory("Gold Class");
		fac.setRate("200");
		facilities.add(fac);
		fac = new FacilityDTO();
		fac.setCategory("Silver Class");
		fac.setRate("150");
		facilities.add(fac);
		
        return new ResponseEntity<List<FacilityDTO>>(facilities, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/cinemas/screen/{cinema}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<ScreenDTO>> getFacilities(final @PathVariable String cinema ){
		
		List<ScreenDTO> screens  = new ArrayList<ScreenDTO>();
		
		ScreenDTO screen = new ScreenDTO();
		screen.setName("Screen-1");
		screen.setId("1");
		
		
		List<FacilityDTO> facilities  = new ArrayList<FacilityDTO>();
		FacilityDTO fac = new FacilityDTO();
		fac.setCategory("Diamond Class");
		fac.setRate("250");
		facilities.add(fac);
		fac = new FacilityDTO();
		fac.setCategory("Gold Class");
		fac.setRate("200");
		facilities.add(fac);
		fac = new FacilityDTO();
		fac.setCategory("Silver Class");
		fac.setRate("150");
		facilities.add(fac);
		
		List<ShowDTO>  shows = new ArrayList<ShowDTO>();
		ShowDTO show = new ShowDTO();
		show.setTimeSlot("9 AM");
		show.setFacilities(facilities);
		shows.add(show);
		
		shows = new ArrayList<ShowDTO>();
		show = new ShowDTO();
		show.setTimeSlot("11 AM");
		show.setFacilities(facilities);
		shows.add(show);
			
		shows = new ArrayList<ShowDTO>();
		show = new ShowDTO();
		show.setTimeSlot("12 AM");
		show.setFacilities(facilities);
		shows.add(show);
		
		
		
		
		
		
		
        return new ResponseEntity<List<ScreenDTO>>(screens, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/cinemas/{screen}/{showCat}/update", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> updateShowDetails(final @PathVariable String screen , final @PathVariable String showCat ,
			@RequestBody List<FacilityDTO> facilities){
		
		System.out.println("Test : "+facilities);
		return new ResponseEntity<String>("Updated", HttpStatus.OK);
	}
	

}
