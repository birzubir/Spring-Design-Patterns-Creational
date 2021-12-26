package birzubir.spring.creational.factory.inheritance;


import birzubir.spring.creational.factory.method.FacebookV2SocialMedia;
import birzubir.spring.creational.factory.method.InstagramSocialMedia;
import birzubir.spring.creational.factory.method.SocialMedia;
import birzubir.spring.creational.factory.method.TwitterSocialMedia;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryInheritanceApplication {


    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaFacebook(){
     return new FacebookV2SocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTwitter(){
        return new TwitterSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaInstagram(){
        return new InstagramSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTikTok(){
        return new TwitterSocialMedia();
    }
}
