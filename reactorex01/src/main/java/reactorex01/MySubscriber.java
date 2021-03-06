package reactorex01;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

// <T> 구독할 데이터 타입
public class MySubscriber implements Subscriber<Integer> {
	
	private Integer size=100000000; //nobounded
	private Subscription s;

	public void onSubscribe(Subscription s) {
		this.s=s;
		System.out.println("3.MySubscriber - 구독 정보 돌려 받음.");
		// 구독응답했으니까 신문줘!!!
		s.request(size); // 받을 개수를 정하는 이유 : 내가 하루에 읽을 수 있는 글자 수의 한계가 있기 때문에(백프레셔 = Backpressure)
	}

	// 데이터를 돌려받는 함수
	public void onNext(Integer t) {
		System.out.println("onNext - 신문 "+t);
		size--;
		if(size==0) {
			size=3;
			s.request(size);
		}
	}

	public void onError(Throwable t) {
		// TODO Auto-generated method stub
		
	}

	public void onComplete() {
		System.out.println("신문 다 받음");
	}

}
