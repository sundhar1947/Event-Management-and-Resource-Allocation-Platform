package com.wecp.eventmanagementsystem.service;


import com.wecp.eventmanagementsystem.entity.Event;
import com.wecp.eventmanagementsystem.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;


@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventDetails(Long eventId) {
        return eventRepository.findById(eventId).orElse(null);
    }

    public Event updateEventSetup(Long eventId, Event updatedEvent) {
        Event oldEvent = eventRepository.findById(eventId).orElse(null);
        updatedEvent.setEventID(oldEvent.getEventID());
        return eventRepository.save(updatedEvent);
    }
}
