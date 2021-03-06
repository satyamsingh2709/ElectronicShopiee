//package com.cg.es.service;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//
//import java.util.Optional;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//
//import com.cg.es.entity.BasketEntity;
//import com.cg.es.entity.CustomerEntity;
//import com.cg.es.entity.Manager;
//import com.cg.es.exception.BasketNotFoundException;
//import com.cg.es.model.AddressModel;
//import com.cg.es.model.BasketModel;
//import com.cg.es.model.CustomerModel;
//import com.cg.es.repository.BasketRepository;
//
//public class BasketServiceTest {
//	
//	@Mock
//	private BasketRepository basketRepo;
//	
//	@InjectMocks
//	private BasketServiceImpl service;
//
//	
//	@Test
//	@DisplayName("add basket")
//	void testAdd() throws BasketNotFoundException {
//		AddressModel address1=new AddressModel("1-100","west coast","sarojini","Mumbai","Maharastra",500001);
//		Manager manager=new Manager(101L,"manager@123");
//		CustomerEntity customer=new CustomerEntity(101L,"9988776655","vishal123@gmail.com","Vishal","vishal@123",address1,manager);
//		
//		BasketEntity basket=new BasketEntity(1L,5,1000.0,customer);
//		Mockito.when(basketRepo.save(basket)).thenReturn(basket);
//		assertTrue(basketRepo.save(basket) != null);
//	}
//	
//	@Test
//	@DisplayName("Basket Details should delete")
//	void testDelete() throws BasketNotFoundException {
//		AddressModel address1=new AddressModel("1-100","west coast","sarojini","Mumbai","Maharastra",500001);
//		Manager manager=new Manager(101L,"manager@123");
//		CustomerEntity customer=new CustomerEntity(101L,"9988776655","vishal123@gmail.com","Vishal","vishal@123",address1,manager);
//		BasketEntity basket=new BasketEntity(1L,5,1000.0,customer);
//		Mockito.when(basketRepo.save(basket)).thenReturn(basket);
//		BasketModel expected=new BasketModel(1L,1000.0,5,101L);
//		service.deleteById(basket.getBasketId());
//		verify(basketRepo,times(1)).deleteById(basket.getBasketId());
//	}
//	
//	@Test
//	@DisplayName("get by Id ")
//	void testFindById () {
//		AddressModel address1=new AddressModel("1-100","west coast","sarojini","Mumbai","Maharastra",500001);
//		Manager manager=new Manager(101L,"manager@123");
//		CustomerEntity customer=new CustomerEntity(101L,"9988776655","vishal123@gmail.com","Vishal","vishal@123",address1,manager);
//		
//		BasketEntity testData=new BasketEntity(101L,5,500.0,customer);
//		
//		BasketModel expected=new BasketModel(101L,500.0,5,101L);
//		
//		Mockito.when(basketRepo.findById(testData.getBasketId())).thenReturn(Optional.of(testData));
//	
//		BasketModel actual=service.findById(testData.getBasketId());
//		
//		assertEquals(expected,actual);
//	}
//	
//}
