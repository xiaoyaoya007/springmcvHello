package test.java;

import com.etc.vo.User;
import com.google.gson.Gson;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TsetJson {
    @Test
    public void json(){//对象转字符串
    User user =new User("tom");
        List<User> list=new ArrayList<User>();
        list.add(user);
        Gson gson= new Gson();
        String json = gson.toJson(list);
        System.out.println(json);
    }

   @Test
    public void json2(){//字符串转对象
        String string="[{\"name\":\"tom\"}]";
        Gson gson= new Gson();
       ArrayList arrayList= gson.fromJson(string,ArrayList.class);
        System.out.println(arrayList);
         }
}
