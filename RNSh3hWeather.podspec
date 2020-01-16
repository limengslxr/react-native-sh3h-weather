
Pod::Spec.new do |s|
  s.name         = "RNSh3hWeather"
  s.version      = "1.0.0"
  s.summary      = "RNSh3hWeather"
  s.description  = <<-DESC
                  RNSh3hWeather
                   DESC
  s.homepage     = "https://github.com/limengslxr/react-native-sh3h-weather.git"
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "limengslxr" => "limengslxr@gmail.com" }
  s.platform     = :ios, "8.0"
  s.source       = { :git => "https://github.com/limengslxr/react-native-sh3h-weather.git", :tag => "master" }
  s.source_files  = "ios/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  s.dependency 'SDWebImage', '5.0'
  #s.dependency "others"

end

  