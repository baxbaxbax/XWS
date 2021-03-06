package xws.team16.securityservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private boolean isAdmin;
    private boolean enabled;
    private String address;
    private String companyName;
    private String businessID;
    private Timestamp lastPasswordResetDate;
    private List<String> roles;
    private String email;
    private boolean flagPaid;
    public int numCanReq;
}
