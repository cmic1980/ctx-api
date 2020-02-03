package sg.ctx.api.web.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yu.miao
 */
@RestController
public class DefaultController {
    @GetMapping("/index")
    @ResponseBody
    public ResponseEntity<?> getList() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name", "CTX API");

        return ResponseEntity.ok().body(jsonObject);
    }
}
