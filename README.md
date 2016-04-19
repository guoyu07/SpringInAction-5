Bean Life Cycle
===============

1. 스프링이 빈을 인스턴스화 한다

2. 스프링이 값과 빈의 레퍼런스를 빈의 프로퍼티에 주입한다

3. 빈이 BeanNameAware를 구현하면 스프링이 빈의 ID를 setBeanName() 메소에 넘긴다

4. 빈이 BeanFactoryAware를 구현하면 setBeanFactory() 메소드를 호출하여 빈 팩토리 자체를 넘긴다

5. 빈이 ApplicationContextAware를 구현하면 스프링이 setApplicationContext() 메소드를 호출하고
   둘러싼 애플리케이션 컨텍스트에 대한 참조를 넘긴다

6. 빈이 BeanPostProcessor 인터페이스를 구현하면 스프링은 postProcessBeforeInitialization()메소드를 호출한다

7. 빈이 InitializingBean 인터페이스를 구현하면 스프링은 afterPropertiesSet() 메소드를 호출한다. 마찬가지로 빈이
   init-method와 함께 선언 됐으면 지정한 초기화 메소드가 호출된다

8. 빈이 BeanPostProcessor를 구현하면 스프링은 postProcessAfterInitialization() 메소드를 호출한다

9. 이 상태가 되면 빈은 애플리케이션에서 사용할 준비가 된 것이며 애플리케이션 컨텍스트가 소멸될 때까지 애플리케이션 컨텍스트에 남아 있다

10. 빈이 DisposableBean 인터페이스를 구현하면 스프링은 destroy() 메소드를 호출한다. 마찬가지로 빈이 destroy-method와 함께 선언됐으면
    지정된 메소드가 호출된다


[![IMAGE ALT TEXT](http://robot6.comicbookresources.com/wp-content/uploads/2015/06/one-piece-guinness-625x750.jpg)](http://www.youtube.com/watch?v=3-3k-4flMFI?autoplay=1 "For You")