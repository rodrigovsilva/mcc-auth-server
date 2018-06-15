package com.rvfs.challenge.mcc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = MccAuthServerApplication.class)
public class MccAuthServerApplicationTests {

    @Test
    public void contextLoads() {

    }
    /*
    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private FilterChainProxy springSecurityFilterChain;

    private MockMvc mockMvc;

    private static final String CONTENT_TYPE_APPLICATION_JSON = "application/json;charset=UTF-8";

    private static final String EMAIL = "johndoe@rvfs.com";
    private static final String NAME = "john";

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).addFilter(springSecurityFilterChain).build();
    }


    private String obtainAccessToken(String username, String password) throws Exception {
        final MultiValueMap<String, String> params = new LinkedMultiValueMap<>();

        params.add(OauthFormFields.GRANT_TYPE.getName(), OauthGrantTypes.CLIENT_CREDENTIALS.getType());
        params.add(OauthFormFields.CLIENT_ID.getName(), OauthClientData.REGISTER_APP.getId());

        // @formatter:off
        ResultActions result = mockMvc.perform(post("/oauth/token")
                .params(params)
                .with(httpBasic(username, password))
                .accept(CONTENT_TYPE_APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(CONTENT_TYPE_APPLICATION_JSON));
        // @formatter:on

        String resultString = result.andReturn().getResponse().getContentAsString();

        JacksonJsonParser jsonParser = new JacksonJsonParser();
        return jsonParser.parseMap(resultString).get("access_token").toString();
    }


    @Test
    public void givenUnauthorized_whenGetAccessTokenWithBadCredentials() throws Exception {
        final MultiValueMap<String, String> params = new LinkedMultiValueMap<>();

        params.add(OauthFormFields.GRANT_TYPE.getName(), OauthGrantTypes.CLIENT_CREDENTIALS.getType());
        params.add(OauthFormFields.CLIENT_ID.getName(), OauthClientData.REGISTER_APP.getId());

        // @formatter:off
        ResultActions result = mockMvc.perform(post("/oauth/token")
                .params(params)
                .with(httpBasic("user", "pass"))
                .accept(CONTENT_TYPE_APPLICATION_JSON))
                .andExpect(status().isUnauthorized())
                .andExpect(content().contentType(CONTENT_TYPE_APPLICATION_JSON));
        // @formatter:on
    }

    @Test
    public void givenToken_whenGetAccessTokenWithRightCredentials() throws Exception {

        obtainAccessToken(OauthClientData.REGISTER_APP.getId(), OauthClientData.REGISTER_APP.getSecret());
    }

  private String obtainUserAccessToken(String username, String password) throws Exception {
        final MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("grant_type", "password");
        params.add("client_id", CLIENT_ID);
        params.add("username", username);
        params.add("password", password);

        // @formatter:off

        ResultActions result = mockMvc.perform(post("/oauth/token")
                .params(params)
                .with(httpBasic(CLIENT_ID, CLIENT_SECRET))
                .accept(CONTENT_TYPE_APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(CONTENT_TYPE_APPLICATION_JSON));

        // @formatter:on

        String resultString = result.andReturn().getResponse().getContentAsString();

        JacksonJsonParser jsonParser = new JacksonJsonParser();
        return jsonParser.parseMap(resultString).get("access_token").toString();
    }
*/
    /*@Test
    public void givenNoToken_whenGetSecureRequest_thenUnauthorized() throws Exception {
        mockMvc.perform(get("/employee").param("email", EMAIL)).andExpect(status().isUnauthorized());
    }

    @Test
    public void givenInvalidRole_whenGetSecureRequest_thenForbidden() throws Exception {
        final String accessToken = obtainAccessToken("user1", "pass");
        System.out.println("token:" + accessToken);
        mockMvc.perform(get("/employee").header("Authorization", "Bearer " + accessToken).param("email", EMAIL)).andExpect(status().isForbidden());
    }

    @Test
    public void givenToken_whenPostGetSecureRequest_thenOk() throws Exception {
        final String accessToken = obtainAccessToken("admin", "nimda");

        String employeeString = "{\"email\":\"" + EMAIL + "\",\"name\":\"" + NAME + "\",\"age\":30}";

        // @formatter:off

        mockMvc.perform(post("/employee")
                .header("Authorization", "Bearer " + accessToken)
                .contentType(CONTENT_TYPE_APPLICATION_JSON)
                .content(employeeString)
                .accept(CONTENT_TYPE_APPLICATION_JSON))
                .andExpect(status().isCreated());

        mockMvc.perform(get("/employee")
                .param("email", EMAIL)
                .header("Authorization", "Bearer " + accessToken)
                .accept(CONTENT_TYPE_APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(CONTENT_TYPE_APPLICATION_JSON))
                .andExpect(jsonPath("$.name", is(NAME)));

        // @formatter:on
    }
*/
}