package dev.krishvora09.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dev.krishvora09")
public class AppConfig {

////    @Bean(name = {"com2", "desktop1", "Beast"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
////    public Alien alien(@Autowired Computer com) {
////    public Alien alien(@Qualifier("desktop") Computer com) {
//    public Alien alien(Computer com) {
//        Alien obj = new Alien();
//        obj.setAge(23);
////        obj.setComp(desktop());
//        obj.setComp(com);
//        return obj;
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }
}
