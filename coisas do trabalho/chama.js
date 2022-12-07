import { TextField } from "@skynexui/components";
import appConfig from '/PaletadeCores.json'
export function TextArea(props) {
  return (
    <TextField 
      {...props}
      textFieldColors={{  
        neutral: {
          textColor: appConfig.theme.colors.global["000"],
          mainColor: appConfig.theme.colors.global["900"], 
          mainColorHighlight: appConfig.theme.colors.main["main_light"], 
        },
      }}
    />
  );

}