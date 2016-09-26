package com.springinaction.spittr.web;

import com.springinaction.spittr.Spitter;
import com.springinaction.spittr.data.SpitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/spitter")
class SpitterController {

    private final SpitterRepository spitterRepository;

    @Autowired
    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value = "/register", method = GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute(new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors, RedirectAttributes model) {
        if (errors.hasErrors()) {
            return "registerForm";
        }
        spitterRepository.save(spitter);
        model.addFlashAttribute(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value = "/{username}", method = GET)
    public String showSpitterProfile(@PathVariable String username, Model model) {
        if (!model.containsAttribute("spitter")) {
            model.addAttribute(spitterRepository.findByUsername(username));
        }
        return "profile";
    }
}
