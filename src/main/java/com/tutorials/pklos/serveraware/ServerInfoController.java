package com.tutorials.pklos.serveraware;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
@RequestMapping(path = "/server")
public class ServerInfoController {

    @GetMapping("/info")
    public ServerInfo info() throws Exception{
        final var hostName = InetAddress.getLocalHost().getHostName();
        final var hostAddress = InetAddress.getLocalHost().getHostAddress();
        return new ServerInfo(hostName, hostAddress);
    }


    public record ServerInfo(String hostName, String hostAddress) {
    }
}
